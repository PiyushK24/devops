pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from the repository
                git 'https://github.com/PiyushK24/devops.git'
            }
        }
        stage('Build') {
            steps {
                // Build the Maven project
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Run tests
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Deploy your Spring Boot application, e.g., to a server
                // This step is optional and depends on your deployment strategy
            }
        }
    }
    
    post {
        success {
            // Notify success
            echo 'Pipeline succeeded!'
        }
        failure {
            // Notify failure
            echo 'Pipeline failed :('
        }
    }
}
