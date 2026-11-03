
# VendorSystem
### Vendor Management and Procurement Platform

A Java-based vendor management platform built with Spring Boot, PostgreSQL, Spring Data JPA, Spring Security, and Thymeleaf.

VendorSystem aims to simplify vendor onboarding, vendor information management, procurement operations, approval workflows, and supplier performance monitoring through a centralized application.

---

## Table of Contents

- [Overview](#overview)
- [Objectives](#objectives)
- [Key Features](#key-features)
- [Technology Stack](#technology-stack)
- [System Architecture](#system-architecture)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Database Configuration](#database-configuration)
- [Environment Variables](#environment-variables)
- [Running the Application](#running-the-application)
- [Testing](#testing)
- [Development Guidelines](#development-guidelines)
- [Performance and Optimization](#performance-and-optimization)
- [Security Considerations](#security-considerations)
- [Git Workflow](#git-workflow)
- [Roadmap](#roadmap)
- [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)
- [License](#license)

---

## Overview

VendorSystem is designed to provide a centralized environment for managing vendor-related business operations.

Organizations frequently handle vendor information across multiple spreadsheets, documents, communication channels, and disconnected systems.

This creates challenges involving:

- Vendor information duplication.
- Manual vendor registration.
- Difficult supplier tracking.
- Inefficient approval processes.
- Limited procurement visibility.
- Inconsistent record management.
- Lack of centralized reporting.

VendorSystem aims to address these challenges by providing a structured and extensible vendor management platform.

The application follows a layered backend architecture using Spring Boot and PostgreSQL.

---

## Objectives

The primary objectives are:

1. Centralize vendor information.
2. Simplify vendor registration and onboarding.
3. Improve vendor record management.
4. Support structured procurement workflows.
5. Provide secure access to application functionality.
6. Improve data consistency and integrity.
7. Enable scalable reporting and analytics.
8. Establish a maintainable backend architecture.

---

## Key Features

### 1. Vendor Management

Planned capabilities:

- Vendor registration.
- Vendor profile management.
- Vendor information updates.
- Vendor categorization.
- Vendor status management.
- Vendor search and filtering.
- Vendor record tracking.

### 2. Vendor Onboarding

Planned capabilities:

- Vendor registration forms.
- Business information collection.
- Contact information management.
- Document submission.
- Vendor verification.
- Approval and rejection workflows.

### 3. Procurement Management

Planned capabilities:

- Purchase requisitions.
- Purchase order creation.
- Purchase approval workflows.
- Procurement history.
- Order status tracking.
- Vendor-based procurement records.

### 4. Dashboard and Reporting

Planned capabilities:

- Vendor overview.
- Vendor status distribution.
- Procurement summaries.
- Vendor activity monitoring.
- Operational reports.
- Data visualization.

### 5. Security and Access Control

Planned capabilities:

- Authentication.
- Role-based authorization.
- Secure password storage.
- Protected application routes.
- Input validation.
- Centralized exception handling.

> Feature availability depends on the current implementation. Planned capabilities should not be considered production-ready until implemented and tested.

---

## Technology Stack

| Technology | Purpose |
|---|---|
| Java 21 | Primary programming language |
| Spring Boot 3.5.x | Backend application framework |
| Spring MVC | Request handling |
| Spring Data JPA | Database abstraction |
| Hibernate | ORM |
| PostgreSQL | Relational database |
| Spring Security | Authentication and authorization |
| Thymeleaf | Server-side rendering |
| Maven | Build and dependency management |
| JUnit 5 | Unit testing |
| Git | Version control |
| GitHub Actions | CI/CD automation |

---

## System Architecture

VendorSystem follows a layered architecture.

```text
                 USER
                   |
                   v
          PRESENTATION LAYER
           Thymeleaf / HTML
                   |
                   v
           CONTROLLER LAYER
        HTTP Requests / Validation
                   |
                   v
             SERVICE LAYER
          Business Logic / Rules
                   |
                   v
           REPOSITORY LAYER
             Spring Data JPA
                   |
                   v
             DATABASE LAYER
                PostgreSQL
```

### Architecture Components

#### Presentation Layer

Responsible for:

- Rendering application pages.
- Displaying vendor information.
- Collecting user input.
- Presenting validation errors.
- Supporting user interactions.

#### Controller Layer

Responsible for:

- Handling HTTP requests.
- Processing incoming parameters.
- Validating request data.
- Invoking service operations.
- Returning views or responses.

#### Service Layer

Responsible for:

- Business logic.
- Vendor lifecycle operations.
- Transaction management.
- Procurement rules.
- Application-level validations.

#### Repository Layer

Responsible for:

- Database communication.
- CRUD operations.
- Query execution.
- Pagination and sorting.
- Data retrieval.

#### Database Layer

PostgreSQL provides relational data persistence and supports:

- Data integrity.
- Relationships.
- Transactions.
- Indexing.
- Query optimization.

---

## Project Structure

The following is the intended logical structure. Actual package names and existing classes should be retained or mapped appropriately during refactoring.

```text
vendorsystem/
│
├── .github/
│   └── workflows/
│       └── ci.yml
│
├── .mvn/
│   └── wrapper/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── vendorsystem/
│   │   │           │
│   │   │           ├── config/
│   │   │           │
│   │   │           ├── common/
│   │   │           │
│   │   │           ├── controller/
│   │   │           │
│   │   │           ├── service/
│   │   │           │
│   │   │           ├── repository/
│   │   │           │
│   │   │           ├── entity/
│   │   │           │
│   │   │           ├── dto/
│   │   │           │
│   │   │           └── VendorSystemApplication.java
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       │   ├── css/
│   │       │   ├── js/
│   │       │   └── images/
│   │       │
│   │       └── templates/
│   │
│   └── test/
│       └── java/
│
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

---

## Prerequisites

Install the following tools before running the application.

| Requirement | Version |
|---|---|
| Java JDK | 21 |
| Maven | Maven Wrapper included |
| PostgreSQL | 14 or newer recommended |
| Git | Latest stable |
| IDE | IntelliJ IDEA / VS Code / Eclipse |

Verify Java:

```bash
java -version
```

Verify Git:

```bash
git --version
```

---

## Installation

### 1. Clone the repository

```bash
git clone https://github.com/Achyut0617/vendorsystem.git
```

### 2. Navigate to the project

```bash
cd vendorsystem
```

### 3. Build the application

Windows:

```powershell
.\mvnw.cmd clean install
```

Linux / macOS:

```bash
chmod +x mvnw
./mvnw clean install
```

---

## Database Configuration

VendorSystem uses PostgreSQL.

### 1. Create the database

```sql
CREATE DATABASE vendorsystem;
```

### 2. Configure database connectivity

Set the following environment variables before running the application:

```text
DB_URL=jdbc:postgresql://localhost:5432/vendorsystem
DB_USERNAME=postgres
DB_PASSWORD=your_database_password
```

### 3. Application properties

Configure your database connection in `application.properties`.

Example:

```properties
spring.application.name=vendorsystem

spring.datasource.url=${DB_URL:jdbc:postgresql://localhost:5432/vendorsystem}
spring.datasource.username=${DB_USERNAME:postgres}
spring.datasource.password=${DB_PASSWORD}

spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false
spring.jpa.open-in-view=false
```

Important:

- Use environment variables for credentials.
- Never commit real database passwords.
- Use controlled database migrations for production deployments.
- The `ddl-auto=update` setting is suitable only as a development convenience, not a production migration strategy.

---

## Environment Variables

| Variable | Description |
|---|---|
| DB_URL | PostgreSQL JDBC connection URL |
| DB_USERNAME | Database username |
| DB_PASSWORD | Database password |
| SERVER_PORT | Application server port |
| DB_POOL_SIZE | Maximum database connections |
| DB_MIN_IDLE | Minimum idle database connections |

Example PowerShell configuration:

```powershell
$env:DB_URL="jdbc:postgresql://localhost:5432/vendorsystem"
$env:DB_USERNAME="postgres"
$env:DB_PASSWORD="your_password"
$env:SERVER_PORT="8080"
```

Do not use actual credentials in source-controlled configuration files.

---

## Running the Application

### Windows

```powershell
.\mvnw.cmd spring-boot:run
```

### Linux / macOS

```bash
./mvnw spring-boot:run
```

Once started, access:

```text
http://localhost:8080
```

The available routes depend on the implemented controllers.

---

## Testing

Run all tests:

```bash
./mvnw test
```

Windows:

```powershell
.\mvnw.cmd test
```

Run the complete verification lifecycle:

```powershell
.\mvnw.cmd clean verify
```

Testing strategy:

| Test Type | Purpose |
|---|---|
| Unit tests | Validate business logic |
| Repository tests | Validate database queries |
| Controller tests | Validate HTTP behavior |
| Integration tests | Validate component interactions |
| Security tests | Validate access restrictions |

---

## Development Guidelines

The project should follow these engineering practices.

### 1. Separation of Concerns

Keep business logic inside service classes.

Avoid placing database queries and business rules directly inside controllers.

### 2. DTO-Based Data Transfer

Use request and response DTOs for external data exchange.

Avoid exposing persistence entities directly through REST endpoints.

### 3. Validation

Use Jakarta Bean Validation for incoming request data.

Examples:

- `@NotBlank`
- `@NotNull`
- `@Email`
- `@Size`
- `@Pattern`

### 4. Exception Handling

Use centralized exception handling to ensure consistent error responses.

### 5. Database Integrity

Use:

- Primary keys.
- Foreign keys.
- Unique constraints.
- Appropriate indexes.
- Transactions.

### 6. Code Quality

Prefer:

- Meaningful class and method names.
- Small, focused methods.
- Reusable services.
- Consistent formatting.
- Automated tests.

---

## Performance and Optimization

The following optimizations are part of the engineering roadmap.

### Database Optimization

- Add indexes for frequently queried columns.
- Avoid unnecessary full-table scans.
- Use appropriate join strategies.
- Analyze slow SQL queries.
- Avoid fetching unnecessary columns.

### Hibernate Optimization

- Prevent N+1 query problems.
- Use lazy loading where appropriate.
- Configure JDBC batching.
- Use projections for read-heavy queries.
- Manage transaction boundaries carefully.

### Application Optimization

- Implement pagination.
- Avoid unnecessary object creation.
- Use caching only for suitable data.
- Avoid redundant database calls.
- Monitor application response times.

### Frontend Optimization

- Reuse UI components.
- Minimize unnecessary JavaScript.
- Optimize CSS and static assets.
- Provide responsive layouts.
- Implement efficient search and filtering.

---

## Security Considerations

Security is an essential part of vendor and procurement management.

Recommended controls:

- Spring Security authentication.
- Role-based access control.
- Secure password hashing.
- CSRF protection for browser forms.
- Server-side input validation.
- Secure session management.
- Restricted database permissions.
- Protection against SQL injection.
- Safe error messages.
- Secret management through environment variables.

Never store passwords in plain text.

---

## Git Workflow

Use meaningful commits.

Example:

```bash
git checkout -b feature/vendor-management
```

After implementing a feature:

```bash
git add .
git commit -m "feat: implement vendor management"
git push origin feature/vendor-management
```

### Commit Convention

| Prefix | Purpose |
|---|---|
| feat | New functionality |
| fix | Bug fixes |
| refactor | Code restructuring |
| perf | Performance improvements |
| test | Testing changes |
| docs | Documentation |
| ci | CI/CD changes |
| chore | Maintenance |

Examples:

```text
feat: add vendor registration workflow
fix: resolve vendor validation issue
refactor: improve service layer architecture
perf: optimize vendor database queries
test: add vendor service unit tests
docs: update project documentation
ci: configure automated Maven pipeline
```

---

## Roadmap

### Phase 1 – Backend Foundation

- [ ] Establish consistent API response structures.
- [ ] Introduce centralized exception handling.
- [ ] Improve validation architecture.
- [ ] Introduce pagination support.
- [ ] Improve package organization.

### Phase 2 – Vendor Management

- [ ] Vendor registration.
- [ ] Vendor profile management.
- [ ] Vendor categorization.
- [ ] Vendor status management.
- [ ] Vendor document management.
- [ ] Vendor search and filtering.

### Phase 3 – Procurement

- [ ] Purchase requisitions.
- [ ] Purchase order management.
- [ ] Approval workflows.
- [ ] Procurement history.
- [ ] Order tracking.

### Phase 4 – Security

- [ ] Authentication.
- [ ] Role-based authorization.
- [ ] Secure session handling.
- [ ] Audit logging.
- [ ] Security testing.

### Phase 5 – UI/UX

- [ ] Modern dashboard.
- [ ] Responsive navigation.
- [ ] Vendor management interface.
- [ ] Advanced search and filtering.
- [ ] Analytics and reporting.

### Phase 6 – Optimization

- [ ] Database indexing.
- [ ] Query optimization.
- [ ] N+1 query prevention.
- [ ] Connection pool tuning.
- [ ] Application monitoring.

### Phase 7 – Deployment

- [ ] Docker configuration.
- [ ] Production profiles.
- [ ] Database migrations.
- [ ] Automated CI/CD.
- [ ] Deployment documentation.

---

## Troubleshooting

### Java version mismatch

Verify:

```bash
java -version
```

Ensure Java 21 is configured.

### Database connection failure

Check:

- PostgreSQL is running.
- Database exists.
- JDBC URL is correct.
- Credentials are correct.
- Database port is accessible.

### Maven build failure

Run:

```bash
./mvnw clean
./mvnw -U verify
```

Windows:

```powershell
.\mvnw.cmd clean
.\mvnw.cmd -U verify
```

### Port already in use

Change the server port:

```powershell
$env:SERVER_PORT="8081"
```

---

## Contributing

Contributions and improvements are welcome.

Suggested workflow:

1. Fork the repository.
2. Create a feature branch.
3. Implement the required changes.
4. Add relevant tests.
5. Verify the Maven build.
6. Submit a pull request.

Please keep contributions focused, documented, and tested.

---

## License

Add the appropriate license information here before distributing the project.

---

## Repository

**GitHub:** https://github.com/Achyut0617/vendorsystem

**Project:** VendorSystem

**Backend:** Java / Spring Boot

**Database:** PostgreSQL

**Build System:** Maven

---

*VendorSystem — Building a structured, maintainable, and scalable vendor management platform.*
