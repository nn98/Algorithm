while True:
  a=list(map(int,input().split()))
  if len(a)<2:
    break;
  b=1
  for i in range(1,len(a),2):
    b=b*a[i]-a[i+1]
    i+=12
  print(b)