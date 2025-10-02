package br.ufpb.dcx.apiauth.security;

public class SecurityConstants {
    public static final String SECRET = "ZTEzYmM4YjY5ZDY0OTI5YzY4ZjY4YjY5YmE0YzM2MjRkY2U5MGRhYzYyMDIxYmY3N2M3MTk4YmY5NDFkMGM1YTEyNjM3NDYyMGU2ODk4MGRkYmFmYTY5ZGE4Y2E4OWRhZjMxYWYwYzg5NTQ5ODU5YjdhZmNmN2E4YjIyNjI5NDI=";
    public static final long EXPIRATION_TIME = 900_000;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String LOGIN_URL = "/api/auth/login";
}
