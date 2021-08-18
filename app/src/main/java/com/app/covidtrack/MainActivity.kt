package com.app.covidtrack

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.json.JSONArray
import org.json.JSONObject
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        apiTask().execute()

    }
    inner class apiTask() : AsyncTask<String, Void, String>() {
        override fun onPreExecute() {
            super.onPreExecute()
        }
        override fun doInBackground(vararg params: String?): String? {
            var response:String?
            try{
                response = URL("https://disease.sh/v3/covid-19/states?sort=todayCases&yesterday=false").readText(
                        Charsets.UTF_8
                )
            }catch (e: Exception){
                response = null
            }
            return response
        }
        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            try {
                /* Extracting JSON returns from the API */
                val jsonArr = JSONArray(result)
                findViewById<TextView>(R.id.state1).text = jsonArr.getJSONObject(0).getString("state")
                findViewById<TextView>(R.id.state1_cases).text = "Cases: " + jsonArr.getJSONObject(0).getString("cases")
                findViewById<TextView>(R.id.state1_deaths).text = "Deaths: " + jsonArr.getJSONObject(0).getString("deaths")
                findViewById<TextView>(R.id.state1_recovered).text = "Recovered: " + jsonArr.getJSONObject(0).getString("recovered")

                findViewById<TextView>(R.id.state2).text = jsonArr.getJSONObject(1).getString("state")
                findViewById<TextView>(R.id.state2_cases).text = "Cases: " + jsonArr.getJSONObject(1).getString("cases")
                findViewById<TextView>(R.id.state2_deaths).text = "Deaths: " + jsonArr.getJSONObject(1).getString("deaths")
                findViewById<TextView>(R.id.state2_recovered).text = "Recovered: " + jsonArr.getJSONObject(1).getString("recovered")

                findViewById<TextView>(R.id.state3).text = jsonArr.getJSONObject(2).getString("state")
                findViewById<TextView>(R.id.state3_cases).text = "Cases: " + jsonArr.getJSONObject(2).getString("cases")
                findViewById<TextView>(R.id.state3_deaths).text = "Deaths: " + jsonArr.getJSONObject(2).getString("deaths")
                findViewById<TextView>(R.id.state3_recovered).text = "Recovered: " + jsonArr.getJSONObject(2).getString("recovered")

                findViewById<TextView>(R.id.state4).text = jsonArr.getJSONObject(3).getString("state")
                findViewById<TextView>(R.id.state4_cases).text = "Cases: " + jsonArr.getJSONObject(3).getString("cases")
                findViewById<TextView>(R.id.state4_deaths).text = "Deaths: " + jsonArr.getJSONObject(3).getString("deaths")
                findViewById<TextView>(R.id.state4_recovered).text = "Recovered: " + jsonArr.getJSONObject(3).getString("recovered")

                findViewById<TextView>(R.id.state5).text = jsonArr.getJSONObject(4).getString("state")
                findViewById<TextView>(R.id.state5_cases).text = "Cases: " + jsonArr.getJSONObject(4).getString("cases")
                findViewById<TextView>(R.id.state5_deaths).text = "Deaths: " + jsonArr.getJSONObject(4).getString("deaths")
                findViewById<TextView>(R.id.state5_recovered).text = "Recovered: " + jsonArr.getJSONObject(4).getString("recovered")

                findViewById<TextView>(R.id.state6).text = jsonArr.getJSONObject(5).getString("state")
                findViewById<TextView>(R.id.state6_cases).text = "Cases: " + jsonArr.getJSONObject(5).getString("cases")
                findViewById<TextView>(R.id.state6_deaths).text = "Deaths: " + jsonArr.getJSONObject(5).getString("deaths")
                findViewById<TextView>(R.id.state6_recovered).text = "Recovered: " + jsonArr.getJSONObject(5).getString("recovered")

                findViewById<TextView>(R.id.state7).text = jsonArr.getJSONObject(6).getString("state")
                findViewById<TextView>(R.id.state7_cases).text = "Cases: " + jsonArr.getJSONObject(6).getString("cases")
                findViewById<TextView>(R.id.state7_deaths).text = "Deaths: " + jsonArr.getJSONObject(6).getString("deaths")
                findViewById<TextView>(R.id.state7_recovered).text = "Recovered: " + jsonArr.getJSONObject(6).getString("recovered")

                findViewById<TextView>(R.id.state8).text = jsonArr.getJSONObject(7).getString("state")
                findViewById<TextView>(R.id.state8_cases).text = "Cases: " + jsonArr.getJSONObject(7).getString("cases")
                findViewById<TextView>(R.id.state8_deaths).text = "Deaths: " + jsonArr.getJSONObject(7).getString("deaths")
                findViewById<TextView>(R.id.state8_recovered).text = "Recovered: " + jsonArr.getJSONObject(7).getString("recovered")

                findViewById<TextView>(R.id.state9).text = jsonArr.getJSONObject(8).getString("state")
                findViewById<TextView>(R.id.state9_cases).text = "Cases: " + jsonArr.getJSONObject(8).getString("cases")
                findViewById<TextView>(R.id.state9_deaths).text = "Deaths: " + jsonArr.getJSONObject(8).getString("deaths")
                findViewById<TextView>(R.id.state9_recovered).text = "Recovered: " + jsonArr.getJSONObject(9).getString("recovered")

                findViewById<TextView>(R.id.state10).text = jsonArr.getJSONObject(9).getString("state")
                findViewById<TextView>(R.id.state10_cases).text = "Cases: " + jsonArr.getJSONObject(9).getString("cases")
                findViewById<TextView>(R.id.state10_deaths).text = "Deaths: " + jsonArr.getJSONObject(9).getString("deaths")
                findViewById<TextView>(R.id.state10_recovered).text = "Recovered: " + jsonArr.getJSONObject(9).getString("recovered")

                findViewById<TextView>(R.id.state11).text = jsonArr.getJSONObject(10).getString("state")
                findViewById<TextView>(R.id.state11_cases).text = "Cases: " + jsonArr.getJSONObject(10).getString("cases")
                findViewById<TextView>(R.id.state11_deaths).text = "Deaths: " + jsonArr.getJSONObject(10).getString("deaths")
                findViewById<TextView>(R.id.state11_recovered).text = "Recovered: " + jsonArr.getJSONObject(10).getString("recovered")

                findViewById<TextView>(R.id.state12).text = jsonArr.getJSONObject(11).getString("state")
                findViewById<TextView>(R.id.state12_cases).text = "Cases: " + jsonArr.getJSONObject(11).getString("cases")
                findViewById<TextView>(R.id.state12_deaths).text = "Deaths: " + jsonArr.getJSONObject(11).getString("deaths")
                findViewById<TextView>(R.id.state12_recovered).text = "Recovered: " + jsonArr.getJSONObject(11).getString("recovered")

                findViewById<TextView>(R.id.state13).text = jsonArr.getJSONObject(12).getString("state")
                findViewById<TextView>(R.id.state13_cases).text = "Cases: " + jsonArr.getJSONObject(12).getString("cases")
                findViewById<TextView>(R.id.state13_deaths).text = "Deaths: " + jsonArr.getJSONObject(12).getString("deaths")
                findViewById<TextView>(R.id.state13_recovered).text = "Recovered: " + jsonArr.getJSONObject(12).getString("recovered")

                findViewById<TextView>(R.id.state14).text = jsonArr.getJSONObject(13).getString("state")
                findViewById<TextView>(R.id.state14_cases).text = "Cases: " + jsonArr.getJSONObject(13).getString("cases")
                findViewById<TextView>(R.id.state14_deaths).text = "Deaths: " + jsonArr.getJSONObject(13).getString("deaths")
                findViewById<TextView>(R.id.state14_recovered).text = "Recovered: " + jsonArr.getJSONObject(13).getString("recovered")

                findViewById<TextView>(R.id.state15).text = jsonArr.getJSONObject(14).getString("state")
                findViewById<TextView>(R.id.state15_cases).text = "Cases: " + jsonArr.getJSONObject(14).getString("cases")
                findViewById<TextView>(R.id.state15_deaths).text = "Deaths: " + jsonArr.getJSONObject(14).getString("deaths")
                findViewById<TextView>(R.id.state15_recovered).text = "Recovered: " + jsonArr.getJSONObject(14).getString("recovered")

                findViewById<TextView>(R.id.state16).text = jsonArr.getJSONObject(15).getString("state")
                findViewById<TextView>(R.id.state16_cases).text = "Cases: " + jsonArr.getJSONObject(15).getString("cases")
                findViewById<TextView>(R.id.state16_deaths).text = "Deaths: " + jsonArr.getJSONObject(15).getString("deaths")
                findViewById<TextView>(R.id.state16_recovered).text = "Recovered: " + jsonArr.getJSONObject(15).getString("recovered")

                findViewById<TextView>(R.id.state17).text = jsonArr.getJSONObject(16).getString("state")
                findViewById<TextView>(R.id.state17_cases).text = "Cases: " + jsonArr.getJSONObject(16).getString("cases")
                findViewById<TextView>(R.id.state17_deaths).text = "Deaths: " + jsonArr.getJSONObject(16).getString("deaths")
                findViewById<TextView>(R.id.state17_recovered).text = "Recovered: " + jsonArr.getJSONObject(16).getString("recovered")

                findViewById<TextView>(R.id.state18).text = jsonArr.getJSONObject(17).getString("state")
                findViewById<TextView>(R.id.state18_cases).text = "Cases: " + jsonArr.getJSONObject(17).getString("cases")
                findViewById<TextView>(R.id.state18_deaths).text = "Deaths: " + jsonArr.getJSONObject(17).getString("deaths")
                findViewById<TextView>(R.id.state18_recovered).text = "Recovered: " + jsonArr.getJSONObject(17).getString("recovered")

                findViewById<TextView>(R.id.state19).text = jsonArr.getJSONObject(18).getString("state")
                findViewById<TextView>(R.id.state19_cases).text = "Cases: " + jsonArr.getJSONObject(18).getString("cases")
                findViewById<TextView>(R.id.state19_deaths).text = "Deaths: " + jsonArr.getJSONObject(18).getString("deaths")
                findViewById<TextView>(R.id.state19_recovered).text = "Recovered: " + jsonArr.getJSONObject(18).getString("recovered")

                findViewById<TextView>(R.id.state20).text = jsonArr.getJSONObject(19).getString("state")
                findViewById<TextView>(R.id.state20_cases).text = "Cases: " + jsonArr.getJSONObject(19).getString("cases")
                findViewById<TextView>(R.id.state20_deaths).text = "Deaths: " + jsonArr.getJSONObject(19).getString("deaths")
                findViewById<TextView>(R.id.state20_recovered).text = "Recovered: " + jsonArr.getJSONObject(19).getString("recovered")

                findViewById<TextView>(R.id.state21).text = jsonArr.getJSONObject(20).getString("state")
                findViewById<TextView>(R.id.state21_cases).text = "Cases: " + jsonArr.getJSONObject(20).getString("cases")
                findViewById<TextView>(R.id.state21_deaths).text = "Deaths: " + jsonArr.getJSONObject(20).getString("deaths")
                findViewById<TextView>(R.id.state21_recovered).text = "Recovered: " + jsonArr.getJSONObject(20).getString("recovered")

                findViewById<TextView>(R.id.state22).text = jsonArr.getJSONObject(21).getString("state")
                findViewById<TextView>(R.id.state22_cases).text = "Cases: " + jsonArr.getJSONObject(21).getString("cases")
                findViewById<TextView>(R.id.state22_deaths).text = "Deaths: " + jsonArr.getJSONObject(21).getString("deaths")
                findViewById<TextView>(R.id.state22_recovered).text = "Recovered: " + jsonArr.getJSONObject(21).getString("recovered")

                findViewById<TextView>(R.id.state23).text = jsonArr.getJSONObject(22).getString("state")
                findViewById<TextView>(R.id.state23_cases).text = "Cases: " + jsonArr.getJSONObject(22).getString("cases")
                findViewById<TextView>(R.id.state23_deaths).text = "Deaths: " + jsonArr.getJSONObject(22).getString("deaths")
                findViewById<TextView>(R.id.state23_recovered).text = "Recovered: " + jsonArr.getJSONObject(22).getString("recovered")

                findViewById<TextView>(R.id.state24).text = jsonArr.getJSONObject(23).getString("state")
                findViewById<TextView>(R.id.state24_cases).text = "Cases: " + jsonArr.getJSONObject(23).getString("cases")
                findViewById<TextView>(R.id.state24_deaths).text = "Deaths: " + jsonArr.getJSONObject(23).getString("deaths")
                findViewById<TextView>(R.id.state24_recovered).text = "Recovered: " + jsonArr.getJSONObject(23).getString("recovered")

                findViewById<TextView>(R.id.state25).text = jsonArr.getJSONObject(24).getString("state")
                findViewById<TextView>(R.id.state25_cases).text = "Cases: " + jsonArr.getJSONObject(24).getString("cases")
                findViewById<TextView>(R.id.state25_deaths).text = "Deaths: " + jsonArr.getJSONObject(24).getString("deaths")
                findViewById<TextView>(R.id.state25_recovered).text = "Recovered: " + jsonArr.getJSONObject(24).getString("recovered")

                findViewById<TextView>(R.id.state26).text = jsonArr.getJSONObject(25).getString("state")
                findViewById<TextView>(R.id.state26_cases).text = "Cases: " + jsonArr.getJSONObject(25).getString("cases")
                findViewById<TextView>(R.id.state26_deaths).text = "Deaths: " + jsonArr.getJSONObject(25).getString("deaths")
                findViewById<TextView>(R.id.state26_recovered).text = "Recovered: " + jsonArr.getJSONObject(25).getString("recovered")

                findViewById<TextView>(R.id.state27).text = jsonArr.getJSONObject(26).getString("state")
                findViewById<TextView>(R.id.state27_cases).text = "Cases: " + jsonArr.getJSONObject(26).getString("cases")
                findViewById<TextView>(R.id.state27_deaths).text = "Deaths: " + jsonArr.getJSONObject(26).getString("deaths")
                findViewById<TextView>(R.id.state27_recovered).text = "Recovered: " + jsonArr.getJSONObject(26).getString("recovered")

                findViewById<TextView>(R.id.state28).text = jsonArr.getJSONObject(27).getString("state")
                findViewById<TextView>(R.id.state28_cases).text = "Cases: " + jsonArr.getJSONObject(27).getString("cases")
                findViewById<TextView>(R.id.state28_deaths).text = "Deaths: " + jsonArr.getJSONObject(27).getString("deaths")
                findViewById<TextView>(R.id.state28_recovered).text = "Recovered: " + jsonArr.getJSONObject(27).getString("recovered")

                findViewById<TextView>(R.id.state29).text = jsonArr.getJSONObject(28).getString("state")
                findViewById<TextView>(R.id.state29_cases).text = "Cases: " + jsonArr.getJSONObject(28).getString("cases")
                findViewById<TextView>(R.id.state29_deaths).text = "Deaths: " + jsonArr.getJSONObject(28).getString("deaths")
                findViewById<TextView>(R.id.state29_recovered).text = "Recovered: " + jsonArr.getJSONObject(28).getString("recovered")

                findViewById<TextView>(R.id.state30).text = jsonArr.getJSONObject(29).getString("state")
                findViewById<TextView>(R.id.state30_cases).text = "Cases: " + jsonArr.getJSONObject(29).getString("cases")
                findViewById<TextView>(R.id.state30_deaths).text = "Deaths: " + jsonArr.getJSONObject(29).getString("deaths")
                findViewById<TextView>(R.id.state30_recovered).text = "Recovered: " + jsonArr.getJSONObject(29).getString("recovered")

                findViewById<TextView>(R.id.state31).text = jsonArr.getJSONObject(30).getString("state")
                findViewById<TextView>(R.id.state31_cases).text = "Cases: " + jsonArr.getJSONObject(30).getString("cases")
                findViewById<TextView>(R.id.state31_deaths).text = "Deaths: " + jsonArr.getJSONObject(30).getString("deaths")
                findViewById<TextView>(R.id.state31_recovered).text = "Recovered: " + jsonArr.getJSONObject(30).getString("recovered")

                findViewById<TextView>(R.id.state32).text = jsonArr.getJSONObject(31).getString("state")
                findViewById<TextView>(R.id.state32_cases).text = "Cases: " + jsonArr.getJSONObject(31).getString("cases")
                findViewById<TextView>(R.id.state32_deaths).text = "Deaths: " + jsonArr.getJSONObject(31).getString("deaths")
                findViewById<TextView>(R.id.state32_recovered).text = "Recovered: " + jsonArr.getJSONObject(31).getString("recovered")

                findViewById<TextView>(R.id.state33).text = jsonArr.getJSONObject(32).getString("state")
                findViewById<TextView>(R.id.state33_cases).text = "Cases: " + jsonArr.getJSONObject(32).getString("cases")
                findViewById<TextView>(R.id.state33_deaths).text = "Deaths: " + jsonArr.getJSONObject(32).getString("deaths")
                findViewById<TextView>(R.id.state33_recovered).text = "Recovered: " + jsonArr.getJSONObject(32).getString("recovered")

                findViewById<TextView>(R.id.state34).text = jsonArr.getJSONObject(33).getString("state")
                findViewById<TextView>(R.id.state34_cases).text = "Cases: " + jsonArr.getJSONObject(33).getString("cases")
                findViewById<TextView>(R.id.state34_deaths).text = "Deaths: " + jsonArr.getJSONObject(33).getString("deaths")
                findViewById<TextView>(R.id.state34_recovered).text = "Recovered: " + jsonArr.getJSONObject(33).getString("recovered")

                findViewById<TextView>(R.id.state35).text = jsonArr.getJSONObject(34).getString("state")
                findViewById<TextView>(R.id.state35_cases).text = "Cases: " + jsonArr.getJSONObject(34).getString("cases")
                findViewById<TextView>(R.id.state35_deaths).text = "Deaths: " + jsonArr.getJSONObject(34).getString("deaths")
                findViewById<TextView>(R.id.state35_recovered).text = "Recovered: " + jsonArr.getJSONObject(34).getString("recovered")

                findViewById<TextView>(R.id.state36).text = jsonArr.getJSONObject(35).getString("state")
                findViewById<TextView>(R.id.state36_cases).text = "Cases: " + jsonArr.getJSONObject(35).getString("cases")
                findViewById<TextView>(R.id.state36_deaths).text = "Deaths: " + jsonArr.getJSONObject(35).getString("deaths")
                findViewById<TextView>(R.id.state36_recovered).text = "Recovered: " + jsonArr.getJSONObject(35).getString("recovered")

                findViewById<TextView>(R.id.state37).text = jsonArr.getJSONObject(36).getString("state")
                findViewById<TextView>(R.id.state37_cases).text = "Cases: " + jsonArr.getJSONObject(36).getString("cases")
                findViewById<TextView>(R.id.state37_deaths).text = "Deaths: " + jsonArr.getJSONObject(36).getString("deaths")
                findViewById<TextView>(R.id.state37_recovered).text = "Recovered: " + jsonArr.getJSONObject(36).getString("recovered")

                findViewById<TextView>(R.id.state38).text = jsonArr.getJSONObject(37).getString("state")
                findViewById<TextView>(R.id.state38_cases).text = "Cases: " + jsonArr.getJSONObject(37).getString("cases")
                findViewById<TextView>(R.id.state38_deaths).text = "Deaths: " + jsonArr.getJSONObject(37).getString("deaths")
                findViewById<TextView>(R.id.state38_recovered).text = "Recovered: " + jsonArr.getJSONObject(37).getString("recovered")

                findViewById<TextView>(R.id.state39).text = jsonArr.getJSONObject(38).getString("state")
                findViewById<TextView>(R.id.state39_cases).text = "Cases: " + jsonArr.getJSONObject(38).getString("cases")
                findViewById<TextView>(R.id.state39_deaths).text = "Deaths: " + jsonArr.getJSONObject(38).getString("deaths")
                findViewById<TextView>(R.id.state39_recovered).text = "Recovered: " + jsonArr.getJSONObject(38).getString("recovered")

                findViewById<TextView>(R.id.state40).text = jsonArr.getJSONObject(39).getString("state")
                findViewById<TextView>(R.id.state40_cases).text = "Cases: " + jsonArr.getJSONObject(39).getString("cases")
                findViewById<TextView>(R.id.state40_deaths).text = "Deaths: " + jsonArr.getJSONObject(39).getString("deaths")
                findViewById<TextView>(R.id.state40_recovered).text = "Recovered: " + jsonArr.getJSONObject(39).getString("recovered")

                findViewById<TextView>(R.id.state41).text = jsonArr.getJSONObject(40).getString("state")
                findViewById<TextView>(R.id.state41_cases).text = "Cases: " + jsonArr.getJSONObject(40).getString("cases")
                findViewById<TextView>(R.id.state41_deaths).text = "Deaths: " + jsonArr.getJSONObject(40).getString("deaths")
                findViewById<TextView>(R.id.state41_recovered).text = "Recovered: " + jsonArr.getJSONObject(40).getString("recovered")

                findViewById<TextView>(R.id.state42).text = jsonArr.getJSONObject(41).getString("state")
                findViewById<TextView>(R.id.state42_cases).text = "Cases: " + jsonArr.getJSONObject(41).getString("cases")
                findViewById<TextView>(R.id.state42_deaths).text = "Deaths: " + jsonArr.getJSONObject(41).getString("deaths")
                findViewById<TextView>(R.id.state42_recovered).text = "Recovered: " + jsonArr.getJSONObject(41).getString("recovered")

                findViewById<TextView>(R.id.state43).text = jsonArr.getJSONObject(42).getString("state")
                findViewById<TextView>(R.id.state43_cases).text = "Cases: " + jsonArr.getJSONObject(42).getString("cases")
                findViewById<TextView>(R.id.state43_deaths).text = "Deaths: " + jsonArr.getJSONObject(42).getString("deaths")
                findViewById<TextView>(R.id.state43_recovered).text = "Recovered: " + jsonArr.getJSONObject(42).getString("recovered")

                findViewById<TextView>(R.id.state44).text = jsonArr.getJSONObject(43).getString("state")
                findViewById<TextView>(R.id.state44_cases).text = "Cases: " + jsonArr.getJSONObject(43).getString("cases")
                findViewById<TextView>(R.id.state44_deaths).text = "Deaths: " + jsonArr.getJSONObject(43).getString("deaths")
                findViewById<TextView>(R.id.state44_recovered).text = "Recovered: " + jsonArr.getJSONObject(43).getString("recovered")

                findViewById<TextView>(R.id.state45).text = jsonArr.getJSONObject(44).getString("state")
                findViewById<TextView>(R.id.state45_cases).text = "Cases: " + jsonArr.getJSONObject(44).getString("cases")
                findViewById<TextView>(R.id.state45_deaths).text = "Deaths: " + jsonArr.getJSONObject(44).getString("deaths")
                findViewById<TextView>(R.id.state45_recovered).text = "Recovered: " + jsonArr.getJSONObject(44).getString("recovered")

                findViewById<TextView>(R.id.state46).text = jsonArr.getJSONObject(45).getString("state")
                findViewById<TextView>(R.id.state46_cases).text = "Cases: " + jsonArr.getJSONObject(45).getString("cases")
                findViewById<TextView>(R.id.state46_deaths).text = "Deaths: " + jsonArr.getJSONObject(45).getString("deaths")
                findViewById<TextView>(R.id.state46_recovered).text = "Recovered: " + jsonArr.getJSONObject(45).getString("recovered")

                findViewById<TextView>(R.id.state47).text = jsonArr.getJSONObject(46).getString("state")
                findViewById<TextView>(R.id.state47_cases).text = "Cases: " + jsonArr.getJSONObject(46).getString("cases")
                findViewById<TextView>(R.id.state47_deaths).text = "Deaths: " + jsonArr.getJSONObject(46).getString("deaths")
                findViewById<TextView>(R.id.state47_recovered).text = "Recovered: " + jsonArr.getJSONObject(46).getString("recovered")

                findViewById<TextView>(R.id.state48).text = jsonArr.getJSONObject(47).getString("state")
                findViewById<TextView>(R.id.state48_cases).text = "Cases: " + jsonArr.getJSONObject(47).getString("cases")
                findViewById<TextView>(R.id.state48_deaths).text = "Deaths: " + jsonArr.getJSONObject(47).getString("deaths")
                findViewById<TextView>(R.id.state48_recovered).text = "Recovered: " + jsonArr.getJSONObject(47).getString("recovered")

                findViewById<TextView>(R.id.state49).text = jsonArr.getJSONObject(48).getString("state")
                findViewById<TextView>(R.id.state49_cases).text = "Cases: " + jsonArr.getJSONObject(48).getString("cases")
                findViewById<TextView>(R.id.state49_deaths).text = "Deaths: " + jsonArr.getJSONObject(48).getString("deaths")
                findViewById<TextView>(R.id.state49_recovered).text = "Recovered: " + jsonArr.getJSONObject(48).getString("recovered")

                findViewById<TextView>(R.id.state50).text = jsonArr.getJSONObject(49).getString("state")
                findViewById<TextView>(R.id.state50_cases).text = "Cases: " + jsonArr.getJSONObject(49).getString("cases")
                findViewById<TextView>(R.id.state50_deaths).text = "Deaths: " + jsonArr.getJSONObject(49).getString("deaths")
                findViewById<TextView>(R.id.state50_recovered).text = "Recovered: " + jsonArr.getJSONObject(49).getString("recovered")




            } catch (e: Exception) {
            }
        }
    }
}