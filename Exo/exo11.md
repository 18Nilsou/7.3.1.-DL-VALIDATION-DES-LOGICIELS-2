nils@macbook-air-de-nils bank-application % mvn test
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.imt.mines:bank-application >-------------------
[INFO] Building bank-application 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- jacoco:0.8.14:prepare-agent (default) @ bank-application ---
[INFO] argLine set to -javaagent:/Users/nils/.m2/repository/org/jacoco/org.jacoco.agent/0.8.14/org.jacoco.agent-0.8.14-runtime.jar=destfile=/Users/nils/Desktop/IMT/S7/validationLogiciel/bank2/bank-application/target/jacoco.exec
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ bank-application ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ bank-application ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ bank-application ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ bank-application ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ bank-application ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.imt.mines.bank.bdd.RunBankAccountCucumberTest

Scenario: A new account has zero balance # src/test/resources/features/bank_account_basic.feature:2
  Given I have a new bank account        # com.imt.mines.bank.bdd.BankAccountBasicSteps.i_have_a_new_bank_account()
  When I check its balance               # com.imt.mines.bank.bdd.BankAccountBasicSteps.i_check_its_balance()
  Then the balance should be 0           # com.imt.mines.bank.bdd.BankAccountBasicSteps.the_balance_should_be(java.lang.Double)
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.085 s -- in com.imt.mines.bank.bdd.RunBankAccountCucumberTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- jacoco:0.8.14:report (report) @ bank-application ---
[INFO] Loading execution data file /Users/nils/Desktop/IMT/S7/validationLogiciel/bank2/bank-application/target/jacoco.exec
[INFO] Analyzed bundle 'bank-application' with 5 classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.295 s
[INFO] Finished at: 2026-01-16T11:31:36+01:00
[INFO] ------------------------------------------------------------------------