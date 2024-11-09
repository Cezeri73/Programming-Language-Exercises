#include <iostream>

class ArrayClass {
private:
    int* array;  // Dinamik dizi i�aret�isi
    int size;    // Dizinin boyutu

public:
    // Parametreli Yap�c� (Constructor)
    ArrayClass(int s) : size(s) {
        array = new int[size];  // Dinamik diziye yer ay�r
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;  // �rnek veri atama (1, 2, 3, ...)
        }
        std::cout << "Constructor �a�r�ld� ve " << size << " elemanl� dizi olu�turuldu.\n";
    }

    // Y�k�c� (Destructor)
    ~ArrayClass() {
        delete[] array;  // Dinamik belle�i serbest b�rak
        std::cout << "Destructor �a�r�ld� ve dizi belle�i serbest b�rak�ld�.\n";
    }

    // Diziyi yazd�ran bir fonksiyon
    void printArray() const {
        for (int i = 0; i < size; i++) {
            std::cout << array[i] << " ";
        }
        std::cout << std::endl;
    }
};

int main() {
    ArrayClass arr(5);  // 5 elemanl� bir dizi olu�tur
    arr.printArray();    // Diziyi ekrana yazd�r

    // Program bitti�inde destructor otomatik olarak �a�r�lacak
    return 0;
}

