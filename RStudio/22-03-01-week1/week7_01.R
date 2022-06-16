m1 = matrix(0,nrow=9,ncol=8)

for(cc in 2:9)
  for(rr in 1:9)
    m1[rr,cc-1] = cc*rr
m1
colnames(m1) = paste0(2:9, '단')
rownames(m1) = paste('x',1:9)

save(m1,file='gugudan.rda')

#반복문
load('gugudan.rda')
for(cc in 2:9)
  for(rr in 1:9)
    if(m1[rr,cc-1]%%2==0)
      m1[rr,cc-1] = 0
m1

#TF마스크
load('gugudan.rda')
m1[m1%%2==0]=0;m1

#ifelse()
load('gugudan.rda')
m1[ifelse(m1%%2==0,T,F)]=0; m1

#which()
load('gugudan.rda')
m1[which(m1%%2==0)]=0; m1

######

#반복문
load('gugudan.rda')
for(cc in 2:9)
  for(rr in 1:9)
    if(m1[rr,cc-1]%%3==0 | m1[rr,cc-1]%%5==0)
      m1[rr,cc-1] = 0
m1

#TF마스크
load('gugudan.rda')
m1[(m1%%3==0 | m1%%5==0)]=0;m1

#ifelse()
load('gugudan.rda')
m1[ifelse(m1%%3==0 | m1%%5==0,T,F)]=0; m1

#which()
load('gugudan.rda')
m1[which(m1%%3==0 | m1%%5==0)]=0; m1

