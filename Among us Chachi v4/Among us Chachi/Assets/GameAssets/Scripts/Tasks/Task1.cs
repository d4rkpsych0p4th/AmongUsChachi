using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class Task1 : MonoBehaviour
{

    Text percentageText;

    private void Start()
    {
        percentageText = GetComponent<Text>();
    }

    public void textUpdate(float value)
    {
        percentageText.text = Mathf.RoundToInt(value * 100)+1 + "%";

        string max = "101%";
        if (percentageText.text == max)
        {
            System.Threading.Thread.Sleep(1500);
            TaskManager.instance.FinishTask(true);
        }

    }


}
