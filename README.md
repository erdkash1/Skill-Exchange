# Community Skill Exchange API

A REST API that connects people who want to share skills with those who want to learn them. 
No money involved — just community members helping each other for free.

## Live URL
https://skill-exchange-production.up.railway.app

## Tech Stack
- Java 21
- Spring Boot 3.5.11
- Spring Security + JWT Authentication
- Spring Data JPA + Hibernate
- PostgreSQL
- Maven
- Deployed on Railway

## How It Works
1. Register as a MEMBER
2. Browse available skills
3. Post a skill offer — "I can teach Guitar"
4. Post a skill request — "I want to learn Guitar"
5. When matched, request status updates to MATCHED
6. Community members help each other for free

## API Endpoints

### Auth (public)
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /auth/register | Register as a member |
| POST | /auth/login | Login and get JWT token |

### Skills (requires JWT)
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /skills | Browse all skills |
| GET | /skills/{id} | Get skill by id |
| GET | /skills/category/{category} | Find skills by category |
| POST | /skills | Create a skill |
| DELETE | /skills/{id} | Delete a skill |

### Skill Offers (requires JWT)
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /offers | See all offers |
| GET | /offers/{id} | Get offer by id |
| POST | /offers | Post a skill you can teach |
| DELETE | /offers/{id} | Remove your offer |

### Skill Requests (requires JWT)
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /requests | See all requests |
| GET | /requests/{id} | Get request by id |
| POST | /requests | Post a skill you want to learn |
| PATCH | /requests/{id}/status | Update status (OPEN/MATCHED/CLOSED) |
| DELETE | /requests/{id} | Remove your request |

## Authentication
1. Register at POST /auth/register
2. Login at POST /auth/login to get JWT token
3. Add token to requests via Auth tab → Bearer Token in Postman

## Project Structure
```
src/main/java/com/iggy/skillexchange/
├── entity/         # Database models
├── repository/     # Data access layer
├── service/        # Business logic
├── controller/     # REST endpoints
└── security/       # JWT authentication
```
```

