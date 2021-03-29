#coding=utf-8
from selenium import  webdriver
import time
def browser(browser):
    '''打开火狐、谷歌、ie浏览器用法，如谷歌：driver=browser('chrome')'''
    try:
       
       if browser=="chrome":
          driver=webdriver.Chrome
          return driver
       else:
           print("Not found browser!You can enter 'firefox','chrome'")
    except Exception as msg:
        print("open browser error:%s"%msg)

if __name__=="__main__":

  

  # 用谷歌浏览器打开天龟网页
    driver_chrome=browser("chrome")
    driver_chrome.get("http://www.tianguiedu.com")
    # 获取浏览器的名称
    print("open browser: %s"%driver_chrome.name)
    # 获取网页名称
    print(driver_chrome.title)
    time.sleep(5)#休眠5秒
    driver_chrome.quit()#谷歌浏览器不关闭网页会报错
