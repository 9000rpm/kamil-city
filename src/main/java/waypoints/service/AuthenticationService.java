package waypoints.service;

import java.security.Key;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;
import javax.ejb.Stateless;
import javax.xml.bind.DatatypeConverter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Stateless
public class AuthenticationService {

	private static String SECRET_KEY = "oldmacdonaldhadafarmheyaheyahooandonhisfarmhehadacowheyaheyahoowithamoomoohereandamoomootherehereamoothereamooeverywhereamoomoo";
	private static final String BEARER = "bearer ";

	public String createJWT(String id, String issuer, String subject) {
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
		long nowMillis = System.currentTimeMillis();
		Date now = new Date(nowMillis);
		byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SECRET_KEY);
		Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
		JwtBuilder builder = Jwts.builder().setId(id).setIssuedAt(now).setSubject(subject).setIssuer(issuer).signWith(signatureAlgorithm, signingKey);
		return builder.compact();
	}

	public boolean authenticate(String authorizationHeader) {
		try {
			if (authorizationHeader == null || !authorizationHeader.toLowerCase().startsWith(BEARER)) {
				return false;
			}
			
			String token = authorizationHeader.substring(BEARER.length()).trim();
			
			// if this throws any exception then token not valid
			Claims claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(SECRET_KEY)).parseClaimsJws(token).getBody();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
