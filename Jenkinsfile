// Jenkinsfile

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // Construir o projeto usando o Maven
                    sh 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Executar os testes
                    sh 'mvn test'
                }
            }
        }

        stage('Deploy') {
            steps {
                // Adicione etapas de implantação aqui, se necessário
            }
        }
    }
}
