'''
Created on Dec. 11, 2018

@author: Brandon Benoit
@version: 2018-12-11
'''


class Ingredient (object):
    ingredientName = ""
    quantity = 0
    measureUnit = ""


    def __init__(self, ingredientName,quantity,measureUnit):
        '''
        Constructor
        '''
        Ingredient.ingredientName = ingredientName
        Ingredient.quantity = quantity
        Ingredient.measureUnit = measureUnit
    '''
    Getters
    '''
    def getIngredientName(self) :
        return Ingredient.ingredientName
    
    
    def getAmount(self):
        return Ingredient.amount
    
    
    def getUnit(self):
        return Ingredient.unit
    
    '''
    Setters
    '''
    def setIngredientName(self, ingredientName): 
        Ingredient.ingredientName = ingredientName
        return
    
    
    def setAmount(self, amount) :
        Ingredient.amount = amount
        return
    
    
    def setUnit(self, unit) :
        Ingredient.unit = unit
        return
    
    
   
    
    
