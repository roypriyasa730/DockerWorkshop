# Docker Workshop: Microservices with Nginx Reverse Proxy

This project demonstrates how to run multiple microservices (Service One and Service Two) behind an Nginx reverse proxy using Docker and Docker Compose. It also shows how to scale services using Compose.

## Features

- **Service One**: Java-based microservice (runs on port 8090)
- **Service Two**: Java-based microservice (runs on port 8888)
- **Nginx**: Acts as a reverse proxy, routing requests to the appropriate service
- **Docker Compose**: Manages multi-container setup and scaling

## Directory Structure

```
.
├── serviceone/
│   └── service-one.jar
├── servicetwo/
│   └── service-two.jar
├── nginx.conf
├── Dockerfile.nginx
├── docker-compose.yml
└── README.md
```

## How It Works

- Requests to `/serviceone/*` are routed to Service One.
- Requests to `/servicetwo/*` are routed to Service Two.
- Nginx handles all incoming