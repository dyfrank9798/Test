import os
import time
import shutil
import getpass
import subprocess

time_dir = time.strftime('%Y%m%d-%H:%M:%S', time.localtime(time.time()))
print(time_dir)