nums = [2, 3, -8, 7, -1, 2, 3]
res = []
for i in range(len(nums)): # i= 0-->n
    for j in range(i,len(nums)):
        if nums[i:j+1] != []:
            res.append(nums[i:j+1] )
for i in res:
    print(i,"-->",sum(i))