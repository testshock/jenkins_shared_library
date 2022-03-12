#!/bin/bash
/Applications/Unity/Hub/Editor/$1/Unity.app/Contents/MacOS/Unity -logfile - -quit -buildTarget $2 -batchmode -projectPath $3 -executeMethod BuildScript.PerformAndroidBuild
