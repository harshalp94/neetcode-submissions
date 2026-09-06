

class BrowserHistory {
    private Stack<String> frontPage;
    private Stack<String> backPage;
    public BrowserHistory(String homepage) {
        frontPage = new Stack();
        backPage = new Stack();
        backPage.push(homepage);
    }

    public void visit(String url) {
        backPage.push(url);
        frontPage = new Stack();
    }

    public String back(int steps) {
        while(steps > 0 && backPage.size() > 1){
            frontPage.push(backPage.pop());
            steps--;
        }
        return backPage.peek();
    }

    public String forward(int steps) {
        while(steps > 0 && !frontPage.isEmpty()){
            backPage.push(frontPage.pop());
            steps--;
        }
        return backPage.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */