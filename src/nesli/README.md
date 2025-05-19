# Git Contribution Workflow

1) Clone project
2) Create a local branch (local nesli) from master and check out that new branch (local nesli)
3) Write your codes in new local branch (local nesli)
4) Without checking out to the local master branch, update the local master (other team members might have done some changes on the remote)
5) After updating master, “ Merge ‘master’ into ‘local nesli’ ” -> we must do this before sending our codes to the remote (origin master)
6) Commit your local nesli changes
   NOTE: Don’t do ‘commit & push’ but instead just commit to be able to undo after a commit if necessary
7) Push to origin: nesli (then we are going to see a origin: nesli branch on IntelliJ Git Log
8) Create a pull request from origin: nesli to origin: master by adding a reviewer since our project’s origin master is protected against direct merges by branch protection rule.

## Tips:

Always merge the latest master into your branch before pushing.

Use clear commit messages and branch names.

Only push to your origin feature branch, never directly to master.
