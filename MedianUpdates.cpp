// Problem Link: https://www.hackerrank.com/challenges/median/problem

#include<bits/stdc++.h>
using namespace std;

void median(vector<char> s,vector<int> X) {
    
    multiset<int> max1, min1;
    for(int i = 0; i < s.size(); i++) {
        
        if(s[i] == 'a') {
            
           if(max1.empty() || (*max1.rbegin()) > X[i]) {
               max1.insert(X[i]);
           } else {
                min1.insert(X[i]);
           } 
               
            if(max1.size() > min1.size()+1) {
                min1.insert(*max1.rbegin());
                max1.erase(max1.find(*max1.rbegin()));
            }
            else if(min1.size() > max1.size()+1) {
                max1.insert(*min1.begin());
                min1.erase(min1.find(*min1.begin()));
            }
           
            if(max1.size() == min1.size()) {
                int a = *max1.rbegin();
                int b = *min1.begin();
                
                double p = (1.0 * a + b * 1.0) / 2.0;
                string s = to_string(p);
                size_t f = s.find('.');
                if(s[f+1] == '5') 
                    s.erase(s.begin()+f+2, s.end());
                else 
                    s.erase(s.begin()+f, s.end());
                
                cout << s << endl;
            } else {
               
                if(max1.size() > min1.size())
                    cout << *(max1.rbegin()) << endl;
                else
                    cout << *(min1.begin()) << endl;
           }
           
        }else {
            
            if(max1.find(X[i]) == max1.end() && min1.find(X[i]) == min1.end()) {
                
                cout << "Wrong!" << endl;
            }  else {
                
                if(max1.find(X[i]) != max1.end()) {
                    
                    max1.erase(max1.find(X[i]));
                } else {
                    
                    min1.erase(min1.find(X[i]));
                }
                
                if(max1.size() > min1.size()+1) {
                    min1.insert(*max1.rbegin());
                    max1.erase(max1.find(*max1.rbegin()));
                }
                else if(min1.size() > max1.size()+1) {
                    max1.insert(*min1.begin());
                    min1.erase(min1.find(*min1.begin()));
                }
                
                if(max1.empty() && min1.empty()) {
                    cout << "Wrong!" << endl;
                }
                else if(max1.size() == min1.size()) {
                    int a = *max1.rbegin();
                    int b = *min1.begin();
                    
                    double p = (1.0 * a + b * 1.0) / 2.0;
                    string s = to_string(p);
                    size_t f = s.find('.');
                    if(s[f+1] == '5') 
                        s.erase(s.begin()+f+2, s.end());
                    else 
                        s.erase(s.begin()+f, s.end());
                    
                    cout << s << endl;
                } else {
                    
                    if(max1.size() > min1.size())
                        cout << *(max1.rbegin()) << endl;
                    else
                        cout << *(min1.begin()) << endl;
                }
            }
        }
    }
}

int main(void){

//Helpers for input and output

	int N;
	cin >> N;
	
	vector<char> s;
    vector<int> X;
	char temp;
    int tempint;
	for(int i = 0; i < N; i++){
		cin >> temp >> tempint;
        s.push_back(temp);
        X.push_back(tempint);
	}
	
	median(s,X);
	return 0;
}
