# = seq(letters[1],letters[length(letters)],by=2); a

#letters[1]

#toupper(seq(letters[1],letters[length(letters)],by=2))

#seq(toupper(letters[1:length(letters)],by=2))


a = letters[seq(2,length(letters),by=2)]; a

toupper(a)

letters[1:length(letters) %% 2 == 0]