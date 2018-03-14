#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <stack>
using namespace std;


int main() {
    stack<string> st;
    string s="";
    int n; cin>>n;
    while(n-- > 0){
        int op; cin>>op;
        if(op==1){
            st.push(s); // store previous state
            string str; cin>>str;
            s+=str;
        }
        else if(op==2){
            st.push(s); // store previous state
            int k; cin>>k;
            s=s.substr(0,s.size()-k);
        }
        else if(op==3){
            int k; cin>>k;
            cout<<s[k-1]<<endl;
        }
        else{
            s=st.top();
            st.pop();
        }
    }
    return 0;
}
