v1 = c(1600,2700,3900)

w500 = v1%/%500 
w100 = (v1%%500)%/%100

m1 = cbind(w500,w100)
colnames(m1) = c('500원','100원')
rownames(m1) = paste0(v1,'원'); m1
