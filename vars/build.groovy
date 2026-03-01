def call () {
        echo 'Building...'
        sh 'mvn clean compile test package'
}