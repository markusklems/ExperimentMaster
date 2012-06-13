ExperimentMaster -- Install
================
1. Download the whirr tarball: `wget https://github.com/downloads/markusklems/ExperimentMaster/whirr-0.8.0-SNAPSHOT.tar.gz`
2. Extract the tarball `tar xvfz whirr-0.8.0-SNAPSHOT.tar.gz`
3. Import the modules whirr-core, whirr-cli, and the services you need into Eclipse as projects
4. Clone the ExperimentMaster: `git clone git@github.com:markusklems/ExperimentMaster.git` (contributor) or `git://github.com/markusklems/ExperimentMaster.git` (read only)
5. Include the whirr modules as projects onto the ExperimentMaster build path.
6. Boom, you're done.

ExperimentMaster -- Getting Started
================
1. Take a look at the recipes/test.properties file to get an idea of the properties that can be configured. You must set AWS_ACCESS_KEY_ID and AWS_SECRET_ACCESS_KEY as environment variables like this:
 * `vi /etc/environment` (to make it work in Eclipse, use /etc/environment not ~/.bashrc or so)
 * Add line: `export AWS_ACCESS_KEY_ID=xxxxxxxxx` (you can get this info from your AWS account)
 * Add line: `export AWS_SECRET_ACCESS_KEY=xxxxxxxxx` (you can get this info from your AWS account)
2. As `whirr.private-key-file` and `whirr.public-key-file` you should set a key that you have registered with github. The ycsb experiment actions rely on downloading workload files from github and uploading ycsb stats to github. That's why you need to give whirr a means to authenticate with git via ssh.
3. Just execute the kit.edu.aifb.eorg.Client as a Java Application. It runs an experiment batch job.