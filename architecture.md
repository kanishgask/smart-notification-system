# System Architecture

## Components
- API Gateway
- Notification Service
- Queue (Kafka)
- Worker Services
- Database
- Cache (Redis)

## Flow
User → API → Queue → Worker → Notification Channel

## Key Design
- Async processing
- Retry mechanism
- Rate limiting
