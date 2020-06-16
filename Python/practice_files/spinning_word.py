def spinning_the_words_5morechars(phrase):
  
    words = []
    words = phrase.split()

    for i in range(0, len(words)):

        if len(words[i]) > 4:
            words[i] = "".join(reversed(words[i]))
        

    return  " ".join(words)

if __name__ == "__main__":
    
    phrase = str(input('write the phrase to spin: '))

    result = spinning_the_words_5morechars(phrase)

    print(result)
