#include <vector>
#include <iostream>
#include <algorithm>
#include <queue>
using namespace std;

char mark = 'X';

int main() {
    int n;
    cin >> n;
    
    char c, m[n][n];
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            cin >> c;
            m[i][j] = c;
        }
    }
    
    int xs, ys, xd, yd;
    cin >> xs >> ys >> xd >> yd;

    queue<int> dist;
    queue<pair<int, int>> q;
    q.push(make_pair(xs, ys));
    dist.push(0);
    m[xs][ys] = mark;
    
    vector<pair<int, int>> mv = { make_pair(-1, 0), make_pair(0, +1), make_pair(+1, 0), make_pair(0, -1) };
    
    while (!q.empty()) {
        pair<int, int> cur = q.front();
        
        if (cur.first == xd && cur.second == yd) {
            cout << dist.front() << endl;
            break;
        }
        
        for (int i = 0; i < mv.size(); ++i) {
            int newX = cur.first + mv[i].first;
            int newY = cur.second + mv[i].second;   
            cout<<"Current ("<<cur.first<<","<<cur.second<<") and mv ("<<mv[i].first
            <<","<<mv[i].second<<")"<<endl;
            while (newX >= 0 && newX < n && newY >= 0 && newY < n && m[newX][newY] != mark) {                
                q.push(make_pair(newX, newY));
                cout<<"New x and y ("<<newX<<","<<newY<<")"<<endl;
                cout<<"Pushed ("<<newX<<","<<newY<<") to queue"<<endl;
                cout<<"Dist front: "<<dist.front()<<endl;
                dist.push(dist.front() + 1);
                cout<<"Dist back/pushed now: "<<dist.back()<<endl;
                m[newX][newY] = mark;
                cout<<"Marked as traversed"<<endl;
                newX += mv[i].first;
                newY += mv[i].second;
                cout<<"Continue new x and y ("<<newX<<","<<newY<<")"<<endl;
            }
        }
        cout<<"q and dist popped"<<endl;
        q.pop();
        dist.pop();
    }
    
    return 0;
}
