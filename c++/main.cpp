#include <iostream>
#include <string>
#include <algorithm>

int main() {
    std::string ethem;
    std::cout << "What type of ethem miss do you want (miss, sir): ";
    std::getline(std::cin, ethem);

    // Convert to lowercase
    std::transform(ethem.begin(), ethem.end(), ethem.begin(), ::tolower);

    if (ethem == "miss") {
        std::cout << "\nIts ethem miss\n";
    } else if (ethem == "sir") {
        std::cout << "\nIts ethem sir\n";
    } else {
        std::cout << "\nWe do not support that ethem miss\n";
    }

    return 0;
}
