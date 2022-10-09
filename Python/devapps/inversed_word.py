def inversedword (word):

    inversed_word = word[::-1]

    if inversed_word == word:
        print('La palabra es un palindromo!')

    else:
        print('La palabra no es un palindromo!')

if __name__ == "__main__":
    word = str(input('Escribe una palabra: '))

    inversedword(word)
