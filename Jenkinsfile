node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/pwu1688/myapp1.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      mvnHome = tool 'M3'
      echo "Maven Home: ${mvnHome}"
   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
      } else {
         bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
      }
   }
   stage('SonarQube Analysis') {
       // requires SonarQube Scanner 2.8+
       def scannerHome = tool 'SonarQube';
       withSonarQubeEnv('My SonarQube Server') {
         sh "${scannerHome}/bin/sonar-scanner"
         sh 'mvn sonar:sonar'
   }   
   stage('Results') {
      //junit '**/target/surefire-reports/TEST-*.xml'
      archiveArtifacts 'target/*.jar'
      echo "Pipeline Completed"
   }
}
