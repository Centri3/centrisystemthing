Star    "AA"
{
    ParentBody     "AA system bar"
    Class          "MVI"

    MassSol         0.06
	RadSol          0.065
	Teff            1.25e+03

	Age             1.12e+03

	RotationPeriod  76.6
	Obliquity       107
	EqAscendNode    118

    Surface
    {
		climatePole     1
		climateTropic   0
		climateSteppeMin 0.0992
		climateSteppeMax 0.359
		climateForestMin 0.42
		climateForestMax 0.282
		mareFreq        20
		mareDensity     0.013
        montesFreq      50
        dunesMagn       0.5
		hillsMagn       0.1
		hillsFreq       50
        canyonsMagn     0.687
        cracksMagn      1
		cracksFreq      1
        cracksOctaves   5
    }

    Atmosphere
    {
        Height      1200
        Bright      20
    }

    Aurora
	{
		Height         3.96e+03
		NorthLat       89.6
		NorthLon       -78.7
		NorthRadius    4.53e+04
		NorthWidth     4.53e+04
		NorthRings     10
		NorthBright    10
		NorthFlashFreq 1.17
		NorthMoveSpeed 100
		NorthParticles 1000
		SouthLat       -87.8
		SouthLon       93.8
		SouthRadius    4.53e+04
		SouthWidth     4.53e+04
		SouthRings     10
		SouthBright    10
		SouthFlashFreq 1.17
		SouthMoveSpeed 100
		SouthParticles 1000
		TopColor    (10.000 3.516 0.000)
		BottomColor (10.000 3.984 0.000)
	}

	Corona
	{
		Radius      2.65e+05
		Period      0.014
		Brightness  6
		RayDensity  8
		RayCurv     5
	}

    Orbit
    {
        RefPlane        "Static"
    }
}
