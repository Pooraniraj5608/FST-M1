import pytest

# Write test method
@pytest.mark.parametrize("earned,spent,expected",[(30,10,20),(20,2,18)])
def test_Money(wallet_amount,earned,spent,expected):

    
    wallet_amount = wallet_amount+earned
    wallet_amount = wallet_amount-spent

    assert wallet_amount == expected