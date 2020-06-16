"""
"abacabad" c
"abacabaabacaba" _
"abcdefghijklmnopqrstuvwxyziflskecznslkjfabe" d
"bcccccccccccccyb" y
"""

def first_not_repeating_char(char_sequence):
    seen_letters = {}

    for idx, letter in enumerate(char_sequence):
        if letter not in seen_letters:
            seen_letters[letter] = (idx, 1)
        else:
            seen_letters[letter] = (seen_letters[letter][0], seen_letters[letter][1] + 1)

#!  seen_letter = {letter,(idx,1)}
#!  seen_letter[letter] = dict[key] = (idx,1)

#!  seen_letter {} = dict ()
#!  Key = letter
#!  value = (idx,1)
#! idx = Index_of_First_Time_Seen_Letter (Este valor permanece constate y representa el indice de la primera vez que se vio una letra.)

#!  value[1] = 1 (Este valor representa cuantas veces se a visto la letra y va variando al ir agregando las tuplas si la letra se repite mas de una vez)

#! Example "abacabad"
#!  seen_letters = {a:(0,1),b:(1,1),a:(0,2),c:(3,1),a:(0,3),b:(1,2),a:(0,4),d:(7,1)}

    final_letters = []
    for key, value in seen_letters.iteritems():
        if value[1] == 1:
            final_letters.append( (key, value[0]) )  
            
#!  seen_letters[key][value]
#!  value = (Index_of_First_Time_Seen_Letter, Counter_Times_Seen)
#!  value[0] = Index_of_First_Time_Seen_Letter
#!  value[1] = Counter_Times_Seen

    not_repeated_letters = sorted(final_letters, key=lambda value: value[1])

#!   final_letters[letter][idx]
#!   value[0] = letter
#!   value[1] = idx

    if not_repeated_letters:
        return not_repeated_letters[0][0]
    else:
        return '_'


if __name__ == '__main__':
    char_sequence = str(raw_input('Escribe una secuencia de caracteres: '))

    result = first_not_repeating_char(char_sequence)

    if result == '_':
        print('Todos los caracteres se repiten.')
    else:
        print('El primer caracter no repetido es: {}'.format(result))