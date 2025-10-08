const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

readline.question("What type of ethem miss do you want (miss, sir): ", ethem => {
    ethem = ethem.toLowerCase();
    if (ethem === "miss") {
        console.log("\nIts ethem miss");
    } else if (ethem === "sir") {
        console.log("\nIts ethem sir");
    } else {
        console.log("\nWe do not support that ethem miss");
    }
    readline.close();
});
