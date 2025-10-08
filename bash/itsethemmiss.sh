#!/bin/bash

read -p "What type of ethem miss do you want (miss, sir): " ethem

if [[ "$ethem" == "miss" ]]; then
    echo -e "\nIts ethem miss"
elif [[ "$ethem" == "sir" ]]; then
    echo -e "\nIts ethem sir"
else
    echo -e "\nWe do not support that ethem miss"
fi
