#include <iostream>
#include <string>

using namespace std;

class Person {
private:
    string name;
    int age;

public:
    // name i�in setter metodu
    void setName(const string& n) {
        name = n;
    }

    // name i�in getter metodu
    string getName() const {
        return name;
    }

    // age i�in setter metodu
    void setAge(int a) {
        if (a >= 0) { // Negatif ya� kontrol�
            age = a;
        } else {
            cerr << "Ge�ersiz ya� de�eri!" << endl;
        }
    }

    // age i�in getter metodu
    int getAge() const {
        return age;
    }

    // Bilgileri ekrana yazd�ran metot
    void displayInfo() const {
        cout << "�sim: " << name << "\nYa�: " << age << endl;
    }
};

int main() {
    Person p;
    p.setName("Murat KAYNAR");
    p.setAge(29);

    cout << "Ki�i Bilgileri:" << endl;
    p.displayInfo();

    return 0;
}

