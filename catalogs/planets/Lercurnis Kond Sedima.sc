Planet	"Sedima/Lercurnis B VI"
{
	ParentBody     "Kond"
	Class          "Ferria"
	Mass            0.241290003
	Radius          4204.2998
	InertiaMoment   0.329470009
	RotationPeriod  749.47
	RotationEpoch   1451545
	Obliquity       1
	EqAscendNode    305.04

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_sedima.cfg"
		SurfStyle       0.921
		Randomize      (0.901, 0.198, -0.687)
		colorDistMagn   0.0775
		colorDistFreq   398
		detailScale     128
		drivenDarkening 0
		seaLevel        0.26
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  2
		icecapHeight    0.617
		climatePole     1
		climateTropic   0.563
		climateEquator  0.563
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.228
		heightTempGrad  0.375
		beachWidth      0.00103
		tropicWidth     0.5
		mainFreq        1.5
		venusFreq       1.03
		venusMagn       0.458
		mareFreq        1.96
		mareDensity     0.165
		terraceProb     0.207
		erosion         0
		montesMagn      0.05
		montesFreq      75
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0634
		dunesFreq       41.4
		dunesFraction   0.117
		hillsMagn       0.1
		hillsFreq       5
		hillsFraction   1
		hills2Fraction  1
		riversMagn      10
		riversFreq      7.56
		riversSin       7.33
		riftsMagn       65.5
		riftsFreq       3.17
		riftsSin        6.78
		canyonsMagn     0.0264
		canyonsFreq     116
		canyonsFraction 0
		cracksMagn      0.0772
		cracksFreq      0.491
		cracksOctaves   0
		craterMagn      1
		craterFreq      5
		craterDensity   1
		craterOctaves   30
		volcanoMagn     0.435
		volcanoFreq     2
		volcanoDensity  0.0611
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.336
		volcanoTemp     2.5e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     0.946
		cycloneFreq     0.788
		cycloneDensity  0.382
		cycloneOctaves  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      2.22
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          20.9
		Velocity        203
		BumpHeight      0.622
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.412
		mainFreq        1.42
		mainOctaves     0
		Coverage        0.397
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          20.9
		Velocity        203
		BumpHeight      0.854
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.351
		mainFreq        1.42
		mainOctaves     0
		Coverage        0.397
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          20.9
		Velocity        203
		BumpHeight      0.453
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.244
		mainFreq        1.42
		mainOctaves     0
		Coverage        0.397
		stripeZones     1
		stripeTwist     3.5
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Sedima"
		Height          100
		Density         0.0839129984
		Pressure        0.100000001
		Greenhouse      25
		Bright          10
		Opacity         1
		SkyLight        3.33
		Hue             0
		Saturation      1

		Composition
		{
			CO2       	100
		}
	}

	Climate
	{
		GlobalWindSpeed  22.8
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.104715849
		SemiMajorAxis   0.109581135
		Eccentricity    0.244274809
		Inclination     1
		AscendingNode   305.038168
		ArgOfPericenter -255.572519
		MeanAnomaly     129.160305
	}
}

