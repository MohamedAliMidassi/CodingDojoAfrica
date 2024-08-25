class user :
    def __init__(self,name,surname,mail,age,is_rewards_member=False,gold_card_points=0) :
        self.first_name=name
        self.last_name=surname
        self.email=mail
        self.age=age
        self.reward=is_rewards_member
        self.gold_card_points=gold_card_points
    def display_info(self):
        print (f'My name is {self.first_name} {self.last_name} my email is {self.email} im {self.age} {self.reward} {self.gold_card_points}')
    def enroll(self):
        self.reward=True
        self.gold_card_points=200
    def spend_points(self,amount):
        self.gold_card_points-=amount
user1=user('mohamed','midassi','a@gmail.com',20,False,0)
user1.display_info()
user1.enroll()
user2=user('jane','doe','b@gmail.com',27,False,300)
user3=user('kane','smith','c@gmail.com',35,True,200)
user1.spend_points(50)
user2.enroll()
user2.spend_points(80)