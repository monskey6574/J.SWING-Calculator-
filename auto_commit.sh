#!/bin/bash

# Check for changes
git status

# Stage all changes
git add .

# Commit with a default message
git commit -m "Auto-committed changes"

# Push to the repository
git push

# Confirm completion
echo "Changes committed and pushed successfully!"

