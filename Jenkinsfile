node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git credentialsId: '15bbe264-9f3c-45ff-aabd-91abc694a044', url: 'https://github.com/pwu1688/myapp1.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      mvnHome = tool 'M3'
   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
      } else {
         bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
      }
   }
   stage('Results') {
      //junit '**/target/surefire-reports/TEST-*.xml'
      archiveArtifacts 'target/*.jar'
   }
}
