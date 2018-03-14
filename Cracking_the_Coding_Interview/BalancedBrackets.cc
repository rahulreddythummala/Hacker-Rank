// Base case of the stack is empty and there is closing type then the equation is invalid

#include <iostream>
#include <vector>
#include <stack>

using namespace std;

// Checks if the two symbols forms a pair or of same type.

bool isPair(char a, char b){
        // Cehcks for pairs
        if((a=='{') & (b=='}')) return true;
        else if((a=='[') & (b==']')) return true;
        else if((a=='(') & (b==')')) return true;
        else return false;
}

// Checeks if the symbol is an openingttype.

bool isOpenType(char a){
        return (a=='{') or (a=='[') or (a=='(');        //Return the open type brace
}

// Checks the validity of an string.

bool validWord(string word){
        stack<char> brSeq;      // A stack to store the opening braces
        for(unsigned i=0;i<word.length();i++){
                if(isOpenType(word[i])) 
                    brSeq.push(word[i]);    //If the brace type is opening one, push it into stack
                else{
                        if(i==0 || brSeq.empty()) return false;
                        char a=brSeq.top();     //Else get the last opening brace
                        brSeq.pop();
                        char b=word[i];         // Get this closing brace
                        if(!isPair(a,b)) return false;  //Check if they are pairs
                }
        }
        if(brSeq.empty()) return true;  //At the end there should not be any opening brace left in the stack.
        return false;   //If there are any braces left return false, because there are no closing braces for them.
}
// Main routine
int main(){
        int num;
        cin>>num;
        vector<string> vWords(num);     //Vector for num words
        for(int i=0;i<num;i++) cin>>vWords[i];
        for(unsigned i=0;i<vWords.size();i++){
                // For each word check the validity
                if(validWord(vWords[i]))
                        vWords[i]="YES"; //If valid replace it with yes
                else vWords[i]="NO";    //Else replace it with No
        }
        // Once the vector is prepared, display the contents
        for(string s: vWords) cout<<s<<endl;
}
