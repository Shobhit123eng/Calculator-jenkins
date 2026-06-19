# Jenkins Multi-Stage Pipeline for Java Calculator

## Project Overview
This project demonstrates a Jenkins Declarative Pipeline for a simple Java Calculator application.

## Pipeline Stages

### 1. Checkout
Source code is fetched from GitHub.

### 2. Build
Java source code is compiled using javac.

### 3. Test
Automated test cases are executed.

### 4. Package
Application files are packaged into a ZIP artifact.

### 5. Archive
Generated artifacts are archived in Jenkins.

## Technologies Used

- Java
- Git
- GitHub
- Jenkins
- CI/CD

## Project Workflow

GitHub → Checkout → Build → Test → Package → Archive

## Build Result

- Build Status: SUCCESS
- Test Status: PASSED
- Artifact Generated: Calculator.zip

## Learning Outcomes

- Jenkins Pipeline Creation
- GitHub Integration
- Build Automation
- Automated Testing
- Artifact Management
- CI/CD Fundamentals
