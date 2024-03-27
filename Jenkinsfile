pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout source code from your Git repository
                git 'https://github.com/your/repository.git'
            }
        }
        
        stage('Build') {
            steps {
                // Build the Spring Boot application
                sh './mvnw clean package'
            }
        }

        stage('Test') {
            steps {
                // Run tests for the Spring Boot application
                sh './mvnw test'
            }
        }
    }

    post {
        success {
            echo 'Build and test succeeded! Deploying...'
            // Add deployment steps here
        }
        failure {
            echo 'Build or test failed! Notify the team...'
            // Add notification steps here
        }
    }
}
