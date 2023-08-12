// Juego rockPaperScissor using conditionals if

var options = {0:'rock', 1:'paper', 2:'scissor'};

function getRandomInt(max) {
    return Math.floor(Math.random() * max);
};

function rockPaperScissor(choise) {
    if (choise == 'rock' && options[getRandomInt(3)] == 'rock') {
        console.log('Tie!');
    } else if (choise == 'rock' && options[getRandomInt(3)] == 'paper') {
        console.log('You Lose!');
    } else if (choise == 'rock' && options[getRandomInt(3)] == 'scissor') {
        console.log('You Win!');
    } else if (choise == 'paper' && options[getRandomInt(3)] == 'rock') {
        console.log('You Win!');
    } else if (choise == 'paper' && options[getRandomInt(3)] == 'paper') {
        console.log('Tie!');
    } else if (choise == 'paper' && options[getRandomInt(3)] == 'scissor') {
        console.log('You Lose!');
    } else if (choise == 'scissor' && options[getRandomInt(3)] == 'rock') {
        console.log('You Lose!');
    } else if (choise == 'scissor' && options[getRandomInt(3)] == 'paper') {
        console.log('You Win!');
    } else if (choise == 'scissor' && options[getRandomInt(3)] == 'scissor') {
        console.log('Tie!');
    }; 
};


// Chagpt optimization (works excelent!!!)

var options = {0: 'rock', 1: 'paper', 2: 'scissor'};

function getRandomInt(max) {
    return Math.floor(Math.random() * max);
}

function rockPaperScissor(choice) {
    var computerChoice = options[getRandomInt(3)];

    if (choice === computerChoice) {
        console.log('Tie!');
    } else if (
        (choice === 'rock' && computerChoice === 'scissor') ||
        (choice === 'paper' && computerChoice === 'rock') ||
        (choice === 'scissor' && computerChoice === 'paper')
    ) {
        console.log('You Win!');
    } else {
        console.log('You Lose!');
    }
}


// Same game using Switch

var options = {0: 'rock', 1: 'paper', 2: 'scissor'};

function getRandomInt(max) {
    return Math.floor(Math.random() * max);
}

function rockPaperScissor(choice) {
    var computerChoice = options[getRandomInt(3)];

    switch(choice) {
        case 'rock':
            switch(computerChoice) {
                case 'scissor': {
                    console.log('You Win!' + '\n The computer choice was ' + computerChoice);
                    break;
                }
                case 'paper': {
                    console.log('You Lose!' + '\n The computer choice was ' + computerChoice);
                    break;
                }
                default: {
                    console.log('Tie!' + '\n The computer choice was ' + computerChoice)
                    break;
                }
            }
            break;

            case 'paper':
                switch(computerChoice) {
                    case 'rock': {
                        console.log('You Win!' + '\n The computer choice was ' + computerChoice);
                        break;
                    }
                    case 'scissor': {
                        console.log('You Lose!' + '\n The computer choice was ' + computerChoice);
                        break;
                    }
                    default: {
                        console.log('Tie!' + '\n The computer choice was ' + computerChoice)
                        break;
                    }
                }
                break;

                case 'scissor':
                    switch(computerChoice) {
                        case 'paper': {
                            console.log('You Win!' + '\n The computer choice was ' + computerChoice);
                            break;
                        }
                        case 'rock': {
                            console.log('You Lose!' + '\n The computer choice was ' + computerChoice);
                            break;
                        }
                        default: {
                            console.log('Tie!' + '\n The computer choice was ' + computerChoice)
                            break;
                        }
                    }
                    break;

                default: {
                    console.log('Invalid choice. Please choose rock, paper, or scissor.');
                }

    };
};







