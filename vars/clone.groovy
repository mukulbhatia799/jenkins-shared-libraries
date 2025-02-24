def clone(String url, String branch) {
    echo 'Hello code'
    git url: url, branch: branch
    echo "code cloning successful"
}
