def palindrome(word):
    word2 = "".join(reversed(word))
  
    if word == word2:
        return True

    return False

if __name__ == "__main__":
    word = str(input('Escriba una palabra: '))

    result = palindrome(word)

    if result is True:
        print('La palabra {} es un palíndromo!'.format(word))

    else:
        print('La palabra {} no es un palíndromo!'.format(word))