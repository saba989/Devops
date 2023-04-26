pipeline{
agent any
tools{
maven 'maven'
jdk 'Jdk-11'
}
stages{
stage('git' ){
steps{
git credentialsId:'github',url:'https://github.com/saba989.git'
}
}
stage('build'){
steps{
bat 'mvn -f  Devops/pom.xml clean install'
}
}
}
}
