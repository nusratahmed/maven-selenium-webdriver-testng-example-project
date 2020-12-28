node {
stage('SCM Checkout')
{
git 'https://github.com/tejasrik/e2e.git'
}
 stage('Compile-Package'){
      // Get maven home path
     //def mvnHome =  tool name: 'maven3.6.3', type: 'maven' 
     //batlabel "${mvnHome}/bin/mvn package"
  // bat "${mvnHome}/bin/mvn clean package"
 // bat label: '', script: "${mvnHome}/bin/mvn clean package"
         def mavenHome = tool name:"Maven-3.6.3",type: "maven"
         
         def mavenCMD= "${mavenHome}/bin/mvn"
         sh "${mavenCMD} clean package"
    }
    }
