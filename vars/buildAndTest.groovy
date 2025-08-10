def call() {
    stage('Build') {
        echo "Building the project..."
        bat 'mvn clean package'
    }
    stage('Test') {
        echo "Running tests..."
        bat'mvn test'
    }
}
