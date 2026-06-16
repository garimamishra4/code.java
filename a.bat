@echo off
cd /d "C:\Path\To\Your\Project"  :: Replace with your local folder path

echo Initializing Git repository...
git init

echo Adding all files...
git add .

echo Creating initial commit...
git commit -m "first commit"

echo Setting branch to main...
git branch -M main

echo Adding remote origin...
git remote add origin https://github.com/garimamishra4/code.java
echo Pushing to GitHub...
git push -u origin main

echo Done!
pause

