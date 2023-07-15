Planet	"Nemor/Atiu I"
{
	ParentBody     "Orp"
	Class          "Ferria"
	Mass            1.5
	Radius          6362.1
	InertiaMoment   0.33209
	Obliquity       0.1
	EqAscendNode    173.13
	TidalLocked     true

	EndogenousHeating 1786.3
	AbsMagn         -3.8041
	SlopeParam      2.9569
	Albedo          0.8
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "atiu_nemor.cfg"
		SurfStyle       0.79329
		Randomize      (-0.506, -0.020, 0.815)
		colorDistMagn   0.073661
		colorDistFreq   903.54
		detailScale     128
		drivenDarkening 0
		seaLevel        0.12214
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1.0076
		icecapHeight    0.32061
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.5625
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41987
		heightTempGrad  0.375
		beachWidth      0.0012078
		tropicWidth     0.5
		mainFreq        1.8702
		venusFreq       1.595
		venusMagn       0.15267
		mareFreq        0.001
		mareDensity     0
		terraceProb     0.15834
		erosion         0
		montesMagn      0.2
		montesFreq      75
		montesSpiky     1
		montesFraction  1
		dunesMagn       0
		dunesFreq       64.604
		dunesFraction   0.15329
		hillsMagn       10
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      25
		riversFreq      4
		riversSin       6
		riftsMagn       100
		riftsFreq       10
		riftsSin        10
		canyonsMagn     0
		canyonsFreq     183.51
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      0.41888
		cracksOctaves   0
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		volcanoMagn     0
		volcanoFreq     0.99237
		volcanoDensity  0.28244
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   1
		volcanoTemp     1900.8
		lavaCoverTidal  0
		lavaCoverSun    1
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     0.80246
		cycloneDensity  0.33299
		cycloneOctaves  0
		BumpHeight      16.307
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      2.3966
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          20
		Velocity        103.41
		BumpHeight      1.4465
		Hapke           1
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  10
		mainFreq        0.57252
		mainOctaves     0
		Coverage        0.32061
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          20
		Velocity        21.618
		BumpHeight      2.5225
		Hapke           1
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  10
		mainFreq        0.57252
		mainOctaves     0
		Coverage        0.32061
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          20
		Velocity        174.59
		BumpHeight      2.5225
		Hapke           1
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  10
		mainFreq        0.57252
		mainOctaves     0
		Coverage        0.32061
		stripeZones     1
		stripeTwist     3.5
	}

	NoLava          true

	Atmosphere
	{
		Model          "Atiu Nemor"
		Height          300
		Density         1.8864
		Pressure        1
		Greenhouse      10
		Bright          7
		Opacity         1
		SkyLight        3.3333
		Hue             0
		Saturation      1

		Composition
		{
			H2O       	42.468
			N2        	32.88
			CO2       	21.664
			SO2       	2.9787
			CO        	0.0086521
			Ne        	8.2629e-05
			Ar        	4.2131e-05
		}
	}

	Aurora
	{
		Height         200
		NorthLat       90
		NorthLon       0
		NorthRadius    4282.3
		NorthWidth     3331.1
		NorthRings     10
		NorthBright    1
		NorthFlashFreq 63.926
		NorthMoveSpeed 0.77792
		NorthParticles 100000
		SouthLat       -90
		SouthLon       0
		SouthRadius    4282.3
		SouthWidth     3331.1
		SouthRings     10
		SouthBright    1
		SouthFlashFreq 73.522
		SouthMoveSpeed 0.97249
		SouthParticles 100000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.914 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0048716
		GasToDust   0
		Particles   10000
		GasBright   0.001
		DustBright  0.010919
		GasColor   (0.000 0.000 0.000)
		DustColor  (0.017 0.032 0.035)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00468711803
		SemiMajorAxis   0.013
		Eccentricity    0.01
		Inclination     0.1
		AscendingNode   173.129771
		ArgOfPericenter 123.664122
		MeanAnomaly     0
	}
}

